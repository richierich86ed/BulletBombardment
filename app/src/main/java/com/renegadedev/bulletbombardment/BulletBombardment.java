package com.renegadedev.bulletbombardment;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class BulletBombardment extends Activity {

    private BulletGame mBBGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get screen resolution
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        // Calling the constructor(initialized)
        // An instance of BulletBombardment
        mBBGame = new BulletGame(this, size.x, size.y);
        setContentView(mBBGame);
    }

    @Override
    // Starting main game thread
    // when the game is launched
    protected void onResume() {
        super.onResume();

        mBBGame.resume();
    }

    @Override
    // Stop the thread when the player quits
    protected void onPause() {
        super.onPause();

        mBBGame.pause();
    }
}