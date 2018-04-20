//index.js
//获取应用实例
const app = getApp()

Page({
data : {

  day : null,
  table : null
},

 getinfo:function(day)
 {
   var thispage = this;
   console.log(this.data.day);
   app.getClassInfo(this.data.day, function(data){
     console.log(data);
     thispage.setData({table : data})
     
   });
 },
  input:function(e){
    console.log(e)
    this.setData({day : e.detail.value})
  },
})
