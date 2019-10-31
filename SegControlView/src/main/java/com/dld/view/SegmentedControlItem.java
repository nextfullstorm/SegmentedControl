package com.dld.view;

/**
 * Created by song on 2016/10/12.
 */

public class SegmentedControlItem
{
    private String name;
    private boolean enabled;

    public SegmentedControlItem(String name)
    {
        this.name = name;
        this.enabled = true;
    }

    public SegmentedControlItem(String name, boolean enabled)
    {
        this.name = name;
        this.enabled = enabled;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }
}
