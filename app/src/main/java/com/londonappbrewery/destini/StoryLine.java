package com.londonappbrewery.destini;

public class StoryLine {
    int storyTextId;
    int topButtonTextId;
    int bottomButtonTextId;

    public StoryLine(int storyTextId,int topButtonTextId,int bottomButtonTextId){
        this.storyTextId = storyTextId;
        this.topButtonTextId = topButtonTextId;
        this.bottomButtonTextId = bottomButtonTextId;
    }

    public int getStoryTextId() {
        return storyTextId;
    }

    public void setStoryTextId(int storyTextId) {
        this.storyTextId = storyTextId;
    }

    public int getTopButtonTextId() {
        return topButtonTextId;
    }

    public void setTopButtonTextId(int topButtonTextId) {
        this.topButtonTextId = topButtonTextId;
    }

    public int getBottomButtonTextId() {
        return bottomButtonTextId;
    }

    public void setBottomButtonTextId(int bottomButtonTextId) {
        this.bottomButtonTextId = bottomButtonTextId;
    }
}
