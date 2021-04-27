var app = new Vue({
    // el은 element의 약어
    // DOM요소를 가리키는 선택자
    // vue.js가 제어하는 범위
    el: '#app-11',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼11 - V-model',
        messages: ['V-model은 양방향 데이터 바인딩을 위한 지시자입니다.',
                'v-model은 뷰 오브젝트의 데이터 값과 HTML요소의 값에 쌍방으로 영향을 미칩니다.',
                'HTML요소의 값이 변하면 뷰 오브젝트의 데이터 값도 같이 변합니다.',
                '한편, v-bind는 뷰 오브젝트의 데이터 값을 HTML요소에만 반영합니다.',
                'HTML요소의 값은 변해도, 뷰 오브젝트의 데이터 값은 바뀌지 않습니다.',
                '뷰 오브젝트의 데이터 값 -> HTML요소의 값으로 전해지는 단방향 데이터 바인딩입니다.'
            ],
        message1: 'v-bind의 경우',
        message2: 'v-model의 경우',
        value1: '입력해주세요.',
        value2: '입력해주세요.'
    }
});