// **********************************************//
// 预定信息表列表 客户端脚本
// 
//
// @author Administrator
// @date 2019年08月22日 14:38
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
      Artery.loadPageData('szq/reserve/reserveList/rs', queryInfo)
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
    addReserve: function() {
      this.goToPage('szq/reserve/reserveEdit/insert?' + new Date() );
    },
    editReserve: function(id) {
      this.goToPage('szq/reserve/reserveEdit/update/' + id + "?" + new Date());
    },
    reserveDetail: function(id) {
      this.goToPage('szq/reserve/reserveDetail/' + id);
    },
    deleteReserve: function(id) {
      var _this = this;
      this.$Modal.confirm({
        title: '提示',
        content: "确认删除当前数据?",
        onOk: function() {
          $http.post('szq/reserve/reserveList/doDelete/' + id)
          .then(function(data){
            Artery.message.info('删除成功');
            _this.$refs.table_reserve.reloadData();
          }).catch(function(error){
            Artery.message.error(error.message);
          });
        }
      });
    }
  }
});
