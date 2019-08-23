// **********************************************//
// 学生编辑 客户端脚本
// 
//
// @author Administrator
// @date 2019年08月19日 10:45
// **********************************************//
var vm = new Vue({
  el: '#app',
  mixins: [],
  data: {
    rs : rs
  },
  methods: {
    submit: function() {
      this.$refs.form.submit('aty/student/studentEdit/doUpdate').then(function(result){
        Artery.message.info('保存成功');
        window.opener.vm.$refs.table_student.reloadData();
        window.opener.vm.$refs.studentWidiow.close();
      }).catch(function(error){
        Artery.message.error(error.message);
      });
    }
  }
});
