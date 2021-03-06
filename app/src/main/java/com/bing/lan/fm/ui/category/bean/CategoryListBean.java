package com.bing.lan.fm.ui.category.bean;

import java.io.Serializable;
import java.util.List;


public class CategoryListBean {

    /**
     * ret : 0
     * list : [{"id":33,"name":"fufeijingping","title":"付费精品","isChecked":false,"orderNum":1,"coverPath":"http://fdfs.xmcdn.com/group18/M01/B8/04/wKgJKli-E-_x3e6MAAQvyyz9IUc316.jpg","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":true},{"id":3,"name":"book","title":"有声书","isChecked":false,"orderNum":2,"coverPath":"http://fdfs.xmcdn.com/group14/M07/4F/92/wKgDZFcZj0XS-UxYAAAFRHjovdg200.png","selectedSwitch":false,"isFinished":true,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":2,"name":"music","title":"音乐","isChecked":false,"orderNum":3,"coverPath":"http://fdfs.xmcdn.com/group11/M08/59/25/wKgDbVcZj8uDl2_EAAAGOCOQ-l0208.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":4,"name":"entertainment","title":"娱乐","isChecked":false,"orderNum":4,"coverPath":"http://fdfs.xmcdn.com/group16/M03/4E/5C/wKgDalcZkDHA_QGOAAAJoct4JuE173.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":12,"name":"comic","title":"相声评书","isChecked":false,"orderNum":5,"coverPath":"http://fdfs.xmcdn.com/group13/M09/4E/8E/wKgDXVcZkGaARrYJAAAJpbvCKsk503.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":6,"name":"kid","title":"儿童","isChecked":false,"orderNum":6,"coverPath":"http://fdfs.xmcdn.com/group15/M05/4C/FB/wKgDaFcZkJbR4IM5AAAIwHdn1Mg506.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":29,"name":"3Dfeel2","title":"3D体验馆","isChecked":false,"orderNum":8,"coverPath":"http://fdfs.xmcdn.com/group14/M08/4F/A0/wKgDY1cZkOGgBnmpAAAID_Tz934974.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":1,"name":"news","title":"头条","isChecked":false,"orderNum":10,"coverPath":"http://fdfs.xmcdn.com/group12/M0A/4E/15/wKgDXFcZkQ2ytVR0AAAGMtCW3Io340.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":28,"name":"talk2","title":"脱口秀","isChecked":false,"orderNum":11,"coverPath":"http://fdfs.xmcdn.com/group8/M04/4E/26/wKgDYFcZkYXSDZhuAAAHk5VjySc471.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":10,"name":"emotion","title":"情感生活","isChecked":false,"orderNum":12,"coverPath":"http://fdfs.xmcdn.com/group10/M0B/49/60/wKgDZ1cZkbWRqPA5AAAH7XAxOR8371.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":9,"name":"culture","title":"历史","isChecked":false,"orderNum":13,"coverPath":"http://fdfs.xmcdn.com/group19/M06/35/4A/wKgJK1fo3cKhwsknAAADhGSul-g745.jpg","selectedSwitch":false,"isFinished":true,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":39,"name":"renwen","title":"人文","isChecked":false,"orderNum":14,"coverPath":"http://fdfs.xmcdn.com/group19/M0A/8A/5C/wKgJK1gF8R2wvlzCAAAF0aBpQLE024.jpg","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":13,"name":"chair","title":"教育培训","isChecked":false,"orderNum":16,"coverPath":"http://fdfs.xmcdn.com/group8/M05/4E/27/wKgDYFcZklHybDJyAAAHYS3gfXk673.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":38,"name":"english","title":"英语","isChecked":false,"orderNum":17,"coverPath":"http://fdfs.xmcdn.com/group13/M08/92/59/wKgDXVdf1SWxV9sJAAAHNFoJSY0123.jpg","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":32,"name":"xiaoyuzhong","title":"小语种","isChecked":false,"orderNum":18,"coverPath":"http://fdfs.xmcdn.com/group12/M09/51/5C/wKgDW1cdfoDi10q8AAAIwWc97G4623.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":40,"name":"baijiajiangtan","title":"百家讲坛","isChecked":false,"orderNum":21,"coverPath":"http://fdfs.xmcdn.com/group20/M06/39/C5/wKgJJ1fqPDzhBhPrAAAG4eALmVg249.jpg","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":15,"name":"radioplay","title":"广播剧","isChecked":false,"orderNum":22,"coverPath":"http://fdfs.xmcdn.com/group9/M09/4E/40/wKgDYlcZksqh9sDuAAAG-jPkaG0869.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":16,"name":"opera","title":"戏曲","isChecked":false,"orderNum":23,"coverPath":"http://fdfs.xmcdn.com/group10/M01/4C/82/wKgDaVcZkvLho2cjAAAJ7qhz4R4903.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":17,"name":"radio","title":"电台","isChecked":false,"orderNum":24,"coverPath":"http://fdfs.xmcdn.com/group10/M01/4C/83/wKgDaVcZkxix8LXOAAAJ7vaVK3A367.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":8,"name":"finance","title":"商业财经","isChecked":false,"orderNum":25,"coverPath":"http://fdfs.xmcdn.com/group12/M0B/4E/16/wKgDXFcZkz3ye1CJAAAGi1fKt20411.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":18,"name":"it","title":"IT科技","isChecked":false,"orderNum":26,"coverPath":"http://fdfs.xmcdn.com/group7/M0A/4F/0B/wKgDWlcZk26BV5_gAAAI3TQOvSc092.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":7,"name":"health","title":"健康养生","isChecked":false,"orderNum":28,"coverPath":"http://fdfs.xmcdn.com/group14/M06/4F/94/wKgDZFcZk6Lz4WxoAAAGtaEPTsU121.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":22,"name":"lvyou","title":"旅游","isChecked":false,"orderNum":30,"coverPath":"http://fdfs.xmcdn.com/group16/M00/4E/69/wKgDbFcZlCug1aZPAAAICleaAhE930.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":21,"name":"qiche","title":"汽车","isChecked":false,"orderNum":31,"coverPath":"http://fdfs.xmcdn.com/group16/M03/4E/69/wKgDbFcZlFLBp8qbAAAIKDsPQcc057.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":24,"name":"youxi","title":"动漫游戏","isChecked":false,"orderNum":32,"coverPath":"http://fdfs.xmcdn.com/group9/M01/4E/8A/wKgDZlcZlH-zq1DUAAAIOhzdiYU667.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":30,"name":"openclass2","title":"名校公开课","isChecked":false,"orderNum":33,"coverPath":"http://fdfs.xmcdn.com/group16/M07/4E/62/wKgDalcZlQTwwzk0AAAFfijmXM4872.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":41,"name":"ccp","title":"党课随身听","isChecked":false,"orderNum":34,"coverPath":"http://fdfs.xmcdn.com/group22/M08/D9/84/wKgJM1iEVA7h-UEfAAAHnd3BiUE322.jpg","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false},{"id":23,"name":"dianying","title":"电影","isChecked":false,"orderNum":35,"coverPath":"http://fdfs.xmcdn.com/group11/M08/40/23/wKgDa1cZlKahTT9DAAAJmF72Hbk009.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":31,"name":"shishangshenghuo","title":"时尚生活","isChecked":false,"orderNum":36,"coverPath":"http://fdfs.xmcdn.com/group8/M09/51/A2/wKgDYVcdf3zwrMQLAAAHTIv6iFY471.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":0,"filterSupported":true,"isPaid":false},{"id":34,"name":"poem","title":"诗歌","isChecked":false,"orderNum":37,"coverPath":"http://fdfs.xmcdn.com/group10/M00/63/FE/wKgDaVcy-MGyJ-GCAAAH9Nc7RaI906.png","selectedSwitch":false,"isFinished":false,"contentType":"album","categoryType":1,"filterSupported":false,"isPaid":false}]
     * msg : 成功
     */

    private int ret;
    private String msg;
    private List<ListBean> list;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        @Override
        public String toString() {
            return "ListBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", title='" + title + '\'' +
                    ", isChecked=" + isChecked +
                    ", orderNum=" + orderNum +
                    ", coverPath='" + coverPath + '\'' +
                    ", selectedSwitch=" + selectedSwitch +
                    ", isFinished=" + isFinished +
                    ", contentType='" + contentType + '\'' +
                    ", categoryType=" + categoryType +
                    ", filterSupported=" + filterSupported +
                    ", isPaid=" + isPaid +
                    '}';
        }

        /**
         * id : 33
         * name : fufeijingping
         * title : 付费精品
         * isChecked : false
         * orderNum : 1
         * coverPath : http://fdfs.xmcdn.com/group18/M01/B8/04/wKgJKli-E-_x3e6MAAQvyyz9IUc316.jpg
         * selectedSwitch : false
         * isFinished : false
         * contentType : album
         * categoryType : 1
         * filterSupported : false
         * isPaid : true
         */

        private int id;
        private String name;
        private String title;
        private boolean isChecked;
        private int orderNum;
        private String coverPath;
        private boolean selectedSwitch;
        private boolean isFinished;
        private String contentType;
        private int categoryType;
        private boolean filterSupported;
        private boolean isPaid;
        private boolean isNormal=true;

        public boolean isNormal() {
            return isNormal;
        }

        public void setNormal(boolean normal) {
            isNormal = normal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public boolean isIsChecked() {
            return isChecked;
        }

        public void setIsChecked(boolean isChecked) {
            this.isChecked = isChecked;
        }

        public int getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(int orderNum) {
            this.orderNum = orderNum;
        }

        public String getCoverPath() {
            return coverPath;
        }

        public void setCoverPath(String coverPath) {
            this.coverPath = coverPath;
        }

        public boolean isSelectedSwitch() {
            return selectedSwitch;
        }

        public void setSelectedSwitch(boolean selectedSwitch) {
            this.selectedSwitch = selectedSwitch;
        }

        public boolean isIsFinished() {
            return isFinished;
        }

        public void setIsFinished(boolean isFinished) {
            this.isFinished = isFinished;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public int getCategoryType() {
            return categoryType;
        }

        public void setCategoryType(int categoryType) {
            this.categoryType = categoryType;
        }

        public boolean isFilterSupported() {
            return filterSupported;
        }

        public void setFilterSupported(boolean filterSupported) {
            this.filterSupported = filterSupported;
        }

        public boolean isIsPaid() {
            return isPaid;
        }

        public void setIsPaid(boolean isPaid) {
            this.isPaid = isPaid;
        }
    }
}
