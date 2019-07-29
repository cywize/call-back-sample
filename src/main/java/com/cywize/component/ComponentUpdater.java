package com.cywize.component;

import java.util.ArrayList;
import java.util.List;

public class ComponentUpdater {
    private IGroupCallBack callBack;
    private List<IComponent> components;

    public ComponentUpdater(){
        callBack = new IGroupCallBack() {
            @Override
            public void valueChanged(String value) {
                updateComponents(value);
            }
        };
        components = new ArrayList<>();
    }

    private void updateComponents(String value){
        components.forEach(component -> {component.setComponentValue(value);
            System.out.println("Value changed: " + value);});
    }

    public IGroupCallBack getCallBack() {
        return callBack;
    }

    public void setCallBack(IGroupCallBack callBack) {
        this.callBack = callBack;
    }

    public List<IComponent> getComponents() {
        return components;
    }

    public void setComponents(List<IComponent> components) {
        this.components = components;
    }
}
