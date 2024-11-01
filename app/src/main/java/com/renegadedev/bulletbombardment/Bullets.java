package com.renegadedev.bulletbombardment;

import android.graphics.RectF;

public class Bullets {
    // A RectF to represent the size and location of the bullet
    private RectF mRect;

    // How fast is the bullet traveling?
    private float mXVelocity;
    private float mYVelocity;

    // How big is the bullet?
    private float mWidth;
    private float mHeight;

    // Bullet Constructor
    Bullets(int screenX) {
        // Configuring the bullets based on
        // screen width in pixels
        mWidth = screenX / 100;
        mHeight = screenX / 100;
        mRect = new RectF();
        mYVelocity = (screenX / 5);
        mXVelocity = (screenX / 5);
    }

    // Return a reference to the RectF
    RectF getRect() {
        return mRect;
    }

}
