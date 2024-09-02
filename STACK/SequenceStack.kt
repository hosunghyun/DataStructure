class Stack {
    val STACK_SIZE: Int = 100 // 스택의 최대 크기를 정해준다.
    var stack: IntArray = IntArray(STACK_SIZE) // 스택의 최대 크기만큼 배열을 생성한다.
    var top: Int = 0 // top을 설정한다.

    val isEmpty: Boolean
        get() {      // 스택이 비었는지 확인
            if (top == 0) {      // top이 0이기 때문에 스택은 비었다.
                return true
            }
            return false
        }
    val isFull: Boolean
        get() {   // 스택이 가득 찼는지 확인
            if (top == STACK_SIZE) {     // top이 스택의 크기와 같기 때문에 가득 찼다.
                return true
            }
            return false
        }

    fun push(data: Int) {
        if (isFull) {      // 가득 찼으면 true가 반환 되기에 중괄호 실행
            println("Stack is Full!")
            return
        }
        stack[top++] = data // 스택 top 위치에 data를 넣고 top은 1 증가
    }

    fun pop(): Int {
        if (isEmpty) {     // 스택이 비었으면 true를 반홚여 중괄호 실행
            println("Stack is Empty!")
            return -1
        }
        return stack[--top] // 스택의 top 위치에 값을 반환 top은 1 감소
    }
}

internal object SequenceStack {
    @JvmStatic
    fun main(args: Array<String>) {
        val stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        println(stack.pop())
        println(stack.pop())
        println(stack.pop())
    }
}