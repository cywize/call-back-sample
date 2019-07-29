package com.cywize.component;

public class ComboBox implements IComponent {
    private String value;
    private IGroupCallBack groupCallBack;

    @Override
    public String whoAmI() {
        return "ComboBox";
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
        valueChanged(value);
    }

    @Override
    public void setComponentValue(String value) {
        this.value = value;
    }

    public void setGroupCallBack(IGroupCallBack groupCallBack){
        this.groupCallBack = groupCallBack;
    }

    private void valueChanged(String value){
        if(this.groupCallBack != null){
            groupCallBack.valueChanged(value);
        }
    }
}
