package com.londonappbrewery.destini;

class StoryLine {
    private int storyTextId;
    private int topButtonTextId;
    private int bottomButtonTextId;
    private boolean ended;


    StoryLine(int storyTextId){
        this.storyTextId = storyTextId;
        this.ended = true;
    }

    StoryLine(int storyTextId, int topButtonTextId, int bottomButtonTextId){
        this.storyTextId = storyTextId;
        this.topButtonTextId = topButtonTextId;
        this.bottomButtonTextId = bottomButtonTextId;
        this.ended = false;
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

    boolean isEnded() {
        return ended;
    }
}