// 입력 5

//출력
//     *
//    ***
//   *****
//  *******
// *********

const st1 = prompt('숫자 입력하기');
            let tree = '';

            for(let i=1; i<=st1; i++){
            let star = '';

            for(let j=1; j<=st1-i; j++){
            star += ' ';
            
        }
            for(let k=1; k<=2*i-1; k++){
             star += '*';
        }

        tree += star + '\n';
        }

        console.log(tree);