/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ServerObjects implements Serializable {

    private Integer oper;
    private Boolean returnedValue;
    private ArrayList<Object> objects;

    public ServerObjects() {
        this.objects = new ArrayList();
    }

    public Integer getOper() {
        return oper;
    }

    public void setOper(Integer oper) {
        this.oper = oper;
    }

    public Boolean getReturnedValue() {
        return returnedValue;
    }

    public void setReturnedValue(Boolean returnedValue) {
        this.returnedValue = returnedValue;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }
}
