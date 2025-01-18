package List;

class Node {
    int data;   // 데이터 필드
    Node next;  // 링크 필드

    // 생성자
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;  // 연결 리스트의 시작 노드

    // 생성자 : 초기에는 리스트가 비어있음
    public LinkedList() {
        this.head = null;
    }

    // 노드 삽입 (리스트 앞에 추가)
    public void preinsert(int data) {
        Node newNode = new Node(data);
        if (head == null) { // 리스트가 비었을 경우
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // 노드 삽입 (리스트 사이에에 추가)
    public void middleinsert(int index, int data) {
        if(index < 0) {     // 0보다 작은 인덱스는 없으므로로
            System.out.println("유효하지 않은 위치입니다.");
            return;
        }
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            if (index == 0) {   // 만약 첫 번째에 삽입한다면면
                newNode.next = head;
                head = newNode;
                return;
            }

            for(int i = 0; i < index - 1; i++) {    // 삽입할 위치 바로 이전 노드 찾기기
                current = current.next;
            }

            if (current == null) {  // 위치가 리스트 길이를 초과한 경우
                System.out.println("삽입하려는 위치가 리스트 길이를 초과합니다.");
            }
            else {
                newNode.next = current.next; // 새 노드의 다음을 현재 노드의 다음으로 설정
                current.next = newNode;     // 현재 노드의 다음을 새 노드로 설정
            }
        }
    }

    // 노드 삽입 (리스트 마지막에 삽입)
    public void lastinsert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {  // 마지막 노드를 찾음
                current = current.next;                
            }
            current.next = newNode;
        }
    }

    // 노드 삭제 (특정 값 삭제)
    public void delete(int data) {
        if (head == null) {
            System.out.println("리스트가 비어 있습니다.");
            return;
        }

        if (head.data == data) {    // 삭제할 값이 첫 번째 노드에 있는 경우
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) { // 삭제할 값이 없는 경우
            System.out.println("삭제하려는 값이 리스트에 없습니다.");
        } 
        else {
            current.next = current.next.next; // 노드 연결 변경으로 삭제
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.lastinsert(10);
        linkedlist.lastinsert(20);
        linkedlist.preinsert(30);
        linkedlist.middleinsert(1, 40);
        linkedlist.delete(10);
    }
}