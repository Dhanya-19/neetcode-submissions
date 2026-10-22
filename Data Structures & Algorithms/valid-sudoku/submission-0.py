class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        seen=set()
        row=[set() for _ in range(0,9)]
        col=[set() for _ in range(0,9)]
        boxes=[set() for _ in range(0,9)]

        for r in range(9):
            for c in range(9):
                num=board[r][c]
                box_index=(r//3)*3+(c//3)

                if num=='.':
                    continue

                if num in row[r] or num in col[c] or num in boxes[box_index]:
                    return False
                row[r].add(num)
                col[c].add(num)
                boxes[box_index].add(num)

        return True