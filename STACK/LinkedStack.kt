class Stack {
    var data: Int
    var pre: Stack? = null
    var top: Stack? = null

    constructor() {
        data = 0
        pre = null
        top = null
    }

    constructor(data: Int) {
        this.data = data
    }

    val isEmpty: Boolean
        get() {
            if (top == null) {
                return true
            }
            return false
        }

    fun push(data: Int) {
        val newStack = Stack(data)
        newStack.pre = top
        top = newStack
    }

    fun pop(): Int {
        val data: Int
        val newStack = top
        if (isEmpty) {
            println("Stack is Empty")
            return 0
        }
        data = newStack!!.data
        top = newStack.pre
        return data
    }
}

internal object LinkedStack {
    @JvmStatic
    fun main(args: Array<String>) {
        val stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        println(stack.pop())
        println(stack.pop())
        println(stack.pop())
        println(stack.pop())
    }
}