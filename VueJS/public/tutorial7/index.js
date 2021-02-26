var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-7',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼7 - V-else-if 심재영',
        message: 'v-else-if는 렌더링을 제어하는 지시자입니다.',
        message1: 'v-if와 같이 사용하는 지시자 입니다',
        message2: '좋아하는 과일을 선택하세요.',
        value: 0,
        label1: '바나나',
        label2: '딸기',
        label3: '사과',
        label4: '복숭아',
        text1: '바나나를 선택했습니다.',
        text2: '딸기를 선택했습니다.',
        text3: '사과를 선택했습니다.',
        text4: '복숭아를 선택했습니다.',
        text5: '아무것도 선택하지 않았습니다.'
    }
});