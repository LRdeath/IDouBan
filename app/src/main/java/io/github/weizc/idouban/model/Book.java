package io.github.weizc.idouban.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Vzc on 2017/5/23.
 */
public class Book implements Serializable{
    /**
     * rating : {"max":10,"numRaters":2045,"average":"8.6","min":0}
     * subtitle : 从小工到专家
     * author : ["Andrew Hunt","David Thomas"]
     * pubdate : 2005-1
     * tags : [{"count":1195,"name":"软件开发","title":"软件开发"},{"count":1137,"name":"编程","title":"编程"},{"count":859,"name":"程序员","title":"程序员"},{"count":750,"name":"程序员修炼之道","title":"程序员修炼之道"},{"count":593,"name":"计算机","title":"计算机"},{"count":554,"name":"软件工程","title":"软件工程"},{"count":533,"name":"程序人生","title":"程序人生"},{"count":392,"name":"programming","title":"programming"}]
     * origin_title : The Pragmatic Programmer
     * image : https://img3.doubanio.com/mpic/s3957863.jpg
     * binding : 平装
     * translator : ["马维达"]
     * catalog : 译序
     前言
     序
     第1章 注重实效的哲学
     第2章 注重实效的途径
     第3章 基本工具
     第4章 注重实效的偏执
     第5章 弯曲，或折断
     第6章 当你编码时
     第7章 在项目开始之前
     第8章 注重实效的项目
     附录A 资源
     附录B 练习解答
     索引
     注重实效的程序员之快速参考指南

     * pages : 333
     * images : {"small":"https://img3.doubanio.com/spic/s3957863.jpg","large":"https://img3.doubanio.com/lpic/s3957863.jpg","medium":"https://img3.doubanio.com/mpic/s3957863.jpg"}
     * alt : https://book.douban.com/subject/1152111/
     * id : 1152111
     * publisher : 电子工业出版社
     * isbn10 : 7505397192
     * isbn13 : 9787505397194
     * title : 程序员修炼之道
     * url : https://api.douban.com/v2/book/1152111
     * alt_title : The Pragmatic Programmer
     * author_intro :
     * summary : 《程序员修炼之道》由一系列的独立的部分组成，涵盖的主题从个人责任、职业发展，直到用于使代码保持灵活、并且易于改编和复用的各种架构技术。利用许多富有娱乐性的奇闻轶事、有思想性的例子以及有趣的类比，全面阐释了软件开发的许多不同方面的最佳实践和重大陷阱。无论你是初学者，是有经验的程序员，还是软件项目经理，本书都适合你阅读。
     * price : 48.00元
     */

    private RatingBean rating;
    private String subtitle;
    private String pubdate;
    private String origin_title;
    private String image;
    private String binding;
    private String catalog;
    private String pages;
    private ImagesBean images;
    private String alt;
    private String id;
    private String publisher;
    private String isbn10;
    private String isbn13;
    private String title;
    private String url;
    private String alt_title;
    private String author_intro;
    private String summary;
    private String price;
    private List<String> author;
    private List<TagsBean> tags;
    private List<String> translator;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getOrigin_title() {
        return origin_title;
    }

    public void setOrigin_title(String origin_title) {
        this.origin_title = origin_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt_title() {
        return alt_title;
    }

    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<String> getTranslator() {
        return translator;
    }

    public void setTranslator(List<String> translator) {
        this.translator = translator;
    }

    public static class RatingBean implements Serializable{
        /**
         * max : 10
         * numRaters : 2045
         * average : 8.6
         * min : 0
         */

        private int max;
        private int numRaters;
        private String average;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getNumRaters() {
            return numRaters;
        }

        public void setNumRaters(int numRaters) {
            this.numRaters = numRaters;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean implements Serializable{
        /**
         * small : https://img3.doubanio.com/spic/s3957863.jpg
         * large : https://img3.doubanio.com/lpic/s3957863.jpg
         * medium : https://img3.doubanio.com/mpic/s3957863.jpg
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class TagsBean implements Serializable{
        /**
         * count : 1195
         * name : 软件开发
         * title : 软件开发
         */

        private int count;
        private String name;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
