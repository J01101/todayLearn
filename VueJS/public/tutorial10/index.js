var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-10',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼10 - V-bind',
        message: 'V-bind는 HTML태그의 속성을 변경하는 지시자입니다.',
        message1: 'v-bind',
        color: 'blue',
        websiteList: ['Google','Naver'],
        urlList: ['https://www.google.com','https://www.naver.com'],
        message2: '기본태그',
        colorMessage: '파란색 입니다.'
    }
}); 