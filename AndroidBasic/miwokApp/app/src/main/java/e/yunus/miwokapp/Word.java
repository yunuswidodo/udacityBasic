package e.yunus.miwokapp;

public class Word {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMiwok;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mDefault;
    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //audio resource ID for the wod
    private int mAudioResourceId;
    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String lutfi, String one, int imageResourceId, int audioResourceId)
    {
        mDefault = lutfi;
        mMiwok = one;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String coba1, String coba11, int audioResourceId) {
        mDefault = coba1;
        mMiwok = coba11;
        mAudioResourceId = audioResourceId;
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


    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}