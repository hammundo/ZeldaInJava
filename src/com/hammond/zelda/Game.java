package com.hammond.zelda;

import com.hammond.display.Display;
import com.hammond.graphics.Assets;
import com.hammond.input.KeyManager;
import com.hammond.states.GameState;
import com.hammond.states.MenuState;
import com.hammond.states.State;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{

    private Display display;
    private Thread thread;
    private boolean running = false;
    private BufferStrategy bs;
    private Graphics g;

    public int width, height;
    public String title;

    //States
    private State gameState;
    private State menuState;
    private State settingsState;

    //Input
    private KeyManager keyManager;


    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
    }

    //Initialises the com.hammond.graphics for the game.
    public void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);

        Assets.init();

        //Init game com.hammond.states
        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);
    }

    //Method updates variables and positions of objects on the canvas.
    private void tick() {
        keyManager.tick();

        if(State.getState() != null) {
            State.getState().tick();
        }
    }

    //Method draws updated positions to the canvas
    private void render() {
        //Create a buffer for the computer to draw to before drawing to the canvas.
        //This should prevent flickering / Vsync issues.
        bs = display.getCanvas().getBufferStrategy();
        //Create buffer if it doesnt exist.
        if(bs == null) {
            display.getCanvas().createBufferStrategy(2);
            return;
        }
        //Create com.hammond.graphics object to enable drawing to the canvas.
        g = bs.getDrawGraphics();
        //clear screen.
        g.clearRect(0, 0, width, height);

        //Drawing block!

        if(State.getState() != null) {
            State.getState().render(g);
        }

        //End drawing block!

        //Show the buffer and stop drawing.
        bs.show();
        g.dispose();
    }

    public  void run() {
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        long timer = 0;
        int ticks = 0;

        //Game loop
        while(running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }
            if(timer >= 1000000000) {
                System.out.println("FPS: " + ticks);
                ticks = 0;
                timer = 0;
            }

        }
        stop();
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    //Threading methods:

    //Starts the game loop and creates a new thread.
    //Method will return early if the game loop is already running to prevent errors.
    public synchronized void start() {
        if(running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    //Stops the game loop and quits threads that are running.
    //Method will return early if the game loop is not running to prevent errors.
    public synchronized void stop() {
        if(!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch(InterruptedException e) {
            System.out.println("THREAD ERROR IN METHOD STOP");
            e.printStackTrace();
        }
    }

}
