var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-3',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼3 -v-text와 v-html 비교',
        message: 'v-html',
        boldText: '<b>boldText</b>',
        italicText: '<i>italicText</i>',
        UnderlinedText: '<u>UnderlinedText</u>',
        message1: 'v-text'
    }
});
