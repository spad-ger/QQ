// **********************************************//
// 学生列表 客户端脚本
// 
//
// @author Administrator
// @date 2019年08月19日 10:45
// **********************************************//
var vm = new Vue({
  el: '#app',
  mixins: [],
  data: {
    rs : [],
    popUrl:''
  },
  methods: {
    loadData:function(queryInfo) {
      var _this = this;
      Artery.loadPageData('aty/student/studentList/rs', queryInfo)
      .then(function (data) {
        _this.rs = data;
      }).catch(function (error) {
        console.error(error.message);
      });
    },
    goToPage: function(url) {
      Artery.open({
        url: url,
        targetType: '_blank'
      });
    },
    addStudent: function() {
      this.goToPage('aty/student/studentEdit/insert?' + new Date() );
    },
    editStudent: function(id) {
      this.goToPage('aty/student/studentEdit/update/' + id + "?" + new Date());
    },
    studentDetail: function(id) {
      this.goToPage('aty/student/studentDetail/' + id);
    },
    deleteStudent: function(id) {
      var _this = this;
      this.$Modal.confirm({
        title: '提示',
        content: "确认删除当前数据?",
        onOk: function() {
          $http.post('aty/student/studentList/doDelete/' + id)
          .then(function(data){
            Artery.message.info('删除成功');
            _this.$refs.table_student.reloadData();
          }).catch(function(error){
            Artery.message.error(error.message);
          });
        }
      });
    }
  }
});
