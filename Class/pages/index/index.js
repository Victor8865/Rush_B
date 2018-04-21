//index.js
//获取应用实例
const app = getApp()

Page({
data : {

  day : null,
  table : "Welcome",
  items: [
    {name:'all',value:'All'},
    { name: 'monday', value: 'Monday' },
    { name: 'tuesday', value: 'Tuesday' },
    { name: 'wedsday', value: 'Wedsday' },
    { name: 'thursday', value: 'Thursday' },
    { name: 'friday', value: 'Friday' },
  ]

},



radioChange: function (e) {
  //console.log('radio发生change事件，携带value值为：', e.detail.value);
  var thispage = this;
  console.log(e.detail.value);
  app.getClassInfo(e.detail.value,function(data){
    console.log(data);
    thispage.setData({table : data});
  })
},



//  getinfo:function(day)
//  {
//    var thispage = this;
//    console.log(this.data.day);
//    app.getClassInfo(this.data.day, function(data){
//      console.log(data);
//      thispage.setData({table : data});
//    });
   
//  },
  input:function(e){
    console.log(e)
    this.setData({day : e.detail.value})
  },
})
