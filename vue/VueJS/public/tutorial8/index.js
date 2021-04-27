var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-8',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼8 - V-for 심재영',
        message: 'V-for는 배열이나 리스트를 연속해서 보여주는 렌더링 지시자입니다.',
        message1: '카테고리를 선택하세요',
        value: 0,
        label1: '꽃',
        label2: '음식',
        label3: '국가',
        label4: '색',
        flowerList: ['라벤더','장비','국화','수국','백합','벚꽃'],
        foodList: ['라면','떡볶이','순대','튀김','오뎅'],
        nationList: ['한국','미국','일본','캐나다','중국','프랑스'],
        colorList: ['빨간색','주황색','노란색','초록색','파란색','남색']
    }
});
