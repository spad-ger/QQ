// **********************************************//
// 新建 客户端脚本
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
			xj: {
				data1: []
			}
		}
	},
	methods: {
		/**
		 *
		 */
		save: function() {
			var _this = this;
			this.$refs['form'].validate().then(function() {
				Artery.ajax.post('xj/Xj', _this.xj).then(function(result) {
					console.log(result);
				});
			}).
			catch (function(error) {
				Artery.message.error(error);
			})



		},
		/**
		 *
		 * @param value ， 当前的值
		 * @param currentDataItem 当前的值所在对象
		 * @param name 当前值对应的name属性
		 */
		radio: function(value, currentDataItem, name) {
			var value = value;
			console.log(value);
		},
		/**
		 *
		 * @param newValue 变化后的数据对象
		 * @param name 当前树的名称
		 * @param event event
		 */
		change: function(newValue, name, event) {
			var _data=[];
			_data.push( {name: '辽宁 ',
                    id: '',
                    disabled: k == 2 ? true : false,
                    open: true,
                    children: [{
                        id:  '-',
                        name: '大连 ' + '-',
                        disabled: k == 2 ? true : false,
                        children: [{
                            id: '-' + '-',
                            disabled: k == 2 ? true : false,
                            name: '高新区 '  + '-'  + '-'
                        }],
                        id:  '-',
                        name: '沈陽 ' + '-',
                        disabled: k == 2 ? true : false,
                        children: [{
                        id: '-' + '-',
                        disabled: k == 2 ? true : false,
                        name: '鐵西區 '  + '-'  + '-'
                              }]
                    }]
                })
                this.data1=_data;
				this.$refs.tree1.update(this.data1)
		},

	}
});