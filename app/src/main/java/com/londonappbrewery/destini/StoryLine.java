package com.londonappbrewery.destini;

public class StoryLine {
    private int storyTextId;
    private int topButtonTextId;
    private int bottomButtonTextId;

    StoryLine(int storyTextId, int topButtonTextId, int bottomButtonTextId){
        this.storyTextId = storyTextId;
        this.topButtonTextId = topButtonTextId;
        this.bottomButtonTextId = bottomButtonTextId;
    }

    int getStoryTextId() {
        return storyTextId;
    }


    int getTopButtonTextId() {
        return topButtonTextId;
    }

    int getBottomButtonTextId() {
        return bottomButtonTextId;
    }
}
