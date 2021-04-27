var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-9',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼9 - V-on',
        message: 'V-on은 이벤트를 처리하는 렌더링 지시자입니다.',
        enemyHP : 100,
        label1 : '공격',
        label2 : '회복'
    },
    methods: {
        onClickAttack: function(e){
            this.enemyHP -= 7
        },
        onClickRecovery: function(e){
            this.enemyHP += 7
        }
    }
});