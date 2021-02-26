var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-6',
    // 어플리케이션에서 사용하는 데이터
    data: {
        isChecked: false,
        header: '튜토리얼6 - V-else 심재영',
        message: 'v-else는 렌더링을 제어하는 지시자입니다.',
        message1: 'v-if와 같이 사용하는 지시자 입니다',
        message2: 'v-if가 true인 경우 v-else는 false이고, v-if가 false인 경우 v-else는 true입니다.',
        text1: '체크박스가 체크되어있습니다.',
        text2: '체크박스가 체크되어있지 않습니다.'
    },
    methods: {
        onClickCheckButton: function (e) {
            this.isChecked = true
        }
    }
});