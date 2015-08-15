package com.example.hatim.locnacelle;

/**
 * Created by Hatim on 30/06/2015.
 */
public class DrawerItem
{
    String ItemName;
    int imgResID;
    private boolean showNotify;

    public DrawerItem(){

    }

    public DrawerItem(boolean showNotify, String itemName, int imgResID) {
        //super();
        ItemName = itemName;
        this.imgResID = imgResID;
        this.showNotify = showNotify;
    }

    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public int getImgResID() {
        return imgResID;
    }
    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }
}
