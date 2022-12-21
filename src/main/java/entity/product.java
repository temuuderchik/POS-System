/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class product implements Serializable {

    private String _prod_name;
    private Integer _prod_cat;
    private Integer _prod_price;
    private String _prod_image_name;
    private byte[] _prod_image;

    public String getProd_name() {
        return _prod_name;
    }

    public void setProd_name(String _prod_name) {
        this._prod_name = _prod_name;
    }

    public Integer getProd_cat() {
        return _prod_cat;
    }

    public void setProd_cat(Integer _prod_cat) {
        this._prod_cat = _prod_cat;
    }

    public Integer getProd_price() {
        return _prod_price;
    }

    public void setProd_price(Integer _prod_price) {
        this._prod_price = _prod_price;
    }

    public String getProd_image_name() {
        return _prod_image_name;
    }

    public void setProd_image_name(String _prod_image_name) {
        this._prod_image_name = _prod_image_name;
    }

    public byte[] getProd_image() {
        return _prod_image;
    }

    public void setProd_image(byte[] _prod_image) {
        this._prod_image = _prod_image;
    }

}
