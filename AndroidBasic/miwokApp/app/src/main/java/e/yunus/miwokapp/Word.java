package e.yunus.miwokapp;

public class Word {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMiwok;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mDefault;
    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String lutfi, String one, int imageResourceId)
    {
        mDefault = lutfi;
        mMiwok = one;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getMiwokTranslation() {
        return mMiwok;
    }

    /**
     * Get the Android version number
     */
    public String getDefaultTranslation() {
        return mDefault;
    }



    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}