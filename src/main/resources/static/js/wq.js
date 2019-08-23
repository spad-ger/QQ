// **********************************************//
// wq 客户端脚本
// 
//
// @author Administrator
// @date 2019-08-20
// **********************************************//
var vm = new Vue({
	el: '#app',
	mixins: [atyTplMixin],
	data: function() {
		return {
			wq: {

			}
		}
	},
	methods: {

		this.$refs['form'].validate().then(function() {

			Artery.ajax.post('wq/wq', _this.wq).then(function(result) {
				console.log(result);
			});

		}).
		catch (function(error) {
			Artery.message.error(error);
		})

	}
});