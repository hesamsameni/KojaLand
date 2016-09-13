package org.vaya_group.charactertest;

import android.os.Message;

/**
 * Created by Sameni on 29/08/2016.
 */
public abstract class Handler {
    public Message obtainMessage() {
        return null;
    }
    public void sendMessage(Message msgObj) {
    }

    public abstract void handleMessage(Message msg);
}
