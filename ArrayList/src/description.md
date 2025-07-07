https://accidental-thumb-deb.notion.site/ArrayList-1fc7bb3b3a0f806ea440e3b7a444fef3

## ArrayList란?

- Java의 `List` 인터페이스를 구현한 **가변 길이 배열** 클래스
- 내부적으로는 배열(`Object[]`)을 사용하지만, **자동으로 크기를 늘려줌**
- 순서 유지 (`index`로 관리), **중복 허용**
- 삽입, 삭제, 검색 등의 다양한 메서드를 제공


## 주요 메서드

| 메서드 | 설명 |
| --- | --- |
| `add(E e)` | 맨 뒤에 요소 추가 |
| `add(int index, E e)` | 특정 위치에 삽입 |
| `get(int index)` | 요소 읽기 |
| `set(int index, E e)` | 요소 수정 |
| `remove(int index)` | 인덱스로 삭제 |
| `remove(Object o)` | 값으로 삭제 |
| `size()` | 요소 개수 |
| `clear()` | 전체 비우기 |
| `contains(Object o)` | 값 존재 여부 확인 |
| `isEmpty()` | 비었는지 확인 |


### 내부 동작 구조

- `ArrayList`는 내부적으로 `Object[]` 배열을 사용
- 초기 용량은 10개 (`new ArrayList<>()`)
- 요소가 넘치면 → 더 큰 배열을 만들어 복사 (`capacity * 1.5`)
- 그래서 **많이 추가하면 비용(성능)이 발생**할 수 있음

---

### 성능 특징 (Big-O)

| 연산 | 시간복잡도 | 설명 |
| --- | --- | --- |
| `get(index)` | O(1) | 인덱스로 접근 |
| `add()` | 평균 O(1) | 뒤에 추가 (하지만 확장 시 O(n)) |
| `add(index)`, `remove(index)` | O(n) | 중간 삽입/삭제는 뒤 요소 이동 |
| `contains()` | O(n) | 선형 검색 |

---

### 주의할 점

- **기본 타입은 안됨** → `int` X → `Integer`로 박싱해서 써야 함
- **동기화 안 됨** → 멀티스레드 환경에선 `Collections.synchronizedList()` 또는 `CopyOnWriteArrayList` 사용
- 자주 삽입/삭제가 필요하면 `LinkedList`가 더 효율적일 수도 있음