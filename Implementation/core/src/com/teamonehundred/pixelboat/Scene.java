package com.teamonehundred.pixelboat;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

interface Scene {
    void draw(SpriteBatch batch);
    void update();
    int getCurrentSceneID();
}
