var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-5',
    // 어플리케이션에서 사용하는 데이터
    data: {
        isChecked: false,
        header: '튜토리얼5 - V-if 심재영',
        message: 'v-if는 렌더링을 제어하는 지시자입니다.',
        message1: 'v-if가 true인 경우 렌더링이 되고 false인 경우 렌더링이 되지 않습니다.',
        text1: '체크박스가 체크되어있습니다.'
    },
    methods: {
        onClickCheckButton: function (e) {
            this.isChecked = true
        }
    }
});