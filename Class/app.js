//app.js
App({
  onLaunch: function () {
   
  },

  getClassInfo:function(day, cb){
    wx.request({
      url: 'http://47.95.235.133:8080/Hello/rush.do?day=' + day, 
      data: {
        x: '',
        y: ''
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data),
        cb(res.data)
      }
    })
  }
})