// **********************************************//
// 图书列表 客户端脚本
// 
//
// @author Administrator
// @date 2019年08月20日 09:16
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
      Artery.loadPageData('aty/eg/book/egBookList/rs', queryInfo)
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
    addEgBook: function() {
      this.goToPage('aty/eg/book/egBookEdit/insert?' + new Date() );
    },
    editEgBook: function(id) {
      this.goToPage('aty/eg/book/egBookEdit/update/' + id + "?" + new Date());
    },
    egBookDetail: function(id) {
      this.goToPage('aty/eg/book/egBookDetail/' + id);
    },
    deleteEgBook: function(id) {
      var _this = this;
      this.$Modal.confirm({
        title: '提示',
        content: "确认删除当前数据?",
        onOk: function() {
          $http.post('aty/eg/book/egBookList/doDelete/' + id)
          .then(function(data){
            Artery.message.info('删除成功');
            _this.$refs.table_egBook.reloadData();
          }).catch(function(error){
            Artery.message.error(error.message);
          });
        }
      });
    }
  }
});
