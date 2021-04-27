var app = new Vue({
    el: '#app-14',
    // 어플리케이션에서 사용하는 데이터
    data: {
        header: '튜토리얼14 - v-once',
        messages: ['v-once는 렌더링 할 때 한번만 진행하는 지시자입니다.',
                '한번 렌더링이 된 후에는 데이터 값이 변해도 갱신이 되지 않습니다.'
            ],
        message1: '입력된 메세지 : ',
        message2: '입력해주세요.'
    }
});
