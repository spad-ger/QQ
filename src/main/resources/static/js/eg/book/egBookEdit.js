// **********************************************//
// 图书编辑 客户端脚本
// 
//
// @author Administrator
// @date 2019年08月22日 14:37
// **********************************************//
var vm = new Vue({
  el: '#app',
  mixins: [],
  data: {
    rs : rs
  },
  methods: {
    submit: function() {
      this.$refs.form.submit('eg/book/egBookEdit/doUpdate').then(function(result){
        Artery.message.info('保存成功');
        window.opener.vm.$refs.table_egBook.reloadData();
        window.opener.vm.$refs.egBookWidiow.close();
      }).catch(function(error){
        Artery.message.error(error.message);
      });
    }
  }
});
