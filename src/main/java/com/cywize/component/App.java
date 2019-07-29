package com.cywize.component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TextBox txtBox = new TextBox();
        ComboBox cboBox = new ComboBox();
        ComponentUpdater updater = new ComponentUpdater();

        txtBox.setGroupCallBack(updater.getCallBack());
        cboBox.setGroupCallBack(updater.getCallBack());

        updater.getComponents().add(txtBox);
        updater.getComponents().add(cboBox);

        txtBox.setValue("sample txtBox");
        cboBox.setValue("sample cboBox");
    }
}
