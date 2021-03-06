/**
  * Copyright 2021 json.cn 
  */
package cn.edu.bistu.music.bean;
import java.util.List;

/**
 * Auto-generated: 2021-12-18 13:57:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Artist {

    private int id;
    private String name;
    private String picUrl;
    private List<String> alias;
    private int albumSize;
    private int picId;
    private String img1v1Url;
    private int img1v1;
    private String trans;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPicUrl(String picUrl) {
         this.picUrl = picUrl;
     }
     public String getPicUrl() {
         return picUrl;
     }

    public void setAlias(List<String> alias) {
         this.alias = alias;
     }
     public List<String> getAlias() {
         return alias;
     }

    public void setAlbumSize(int albumSize) {
         this.albumSize = albumSize;
     }
     public int getAlbumSize() {
         return albumSize;
     }

    public void setPicId(int picId) {
         this.picId = picId;
     }
     public int getPicId() {
         return picId;
     }

    public void setImg1v1Url(String img1v1Url) {
         this.img1v1Url = img1v1Url;
     }
     public String getImg1v1Url() {
         return img1v1Url;
     }

    public void setImg1v1(int img1v1) {
         this.img1v1 = img1v1;
     }
     public int getImg1v1() {
         return img1v1;
     }

    public void setTrans(String trans) {
         this.trans = trans;
     }
     public String getTrans() {
         return trans;
     }

}