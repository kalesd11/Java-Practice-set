const swap = (arr, x, y) => {
  let temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
};

const bubbleSort = (arr) => {
  const n = arr.length;
  let isSwapped = false;
  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        swap(arr, j, j + 1);
        isSwapped = true;
      }
    }
    if (!isSwapped) {
      break;
    }
  }
  return arr;
};
let arr = [3, 5, 2, 1, 98, 65, 35, 32, 12, 45, 43, 56];
let arr1 = [2, 1, 3, 4, 7, 8];
// bubbleSort(arr1);
// console.log(arr1);

const selectionSort = (arr) => {
  const n = arr.length;
  for (let i = 0; i < n; i++) {
    let min = i;
    for (let j = i + 1; j < n; j++) {
      if (arr[j] < arr[min]) {
        min = j;
      }
    }
    if (min != i) {
      swap(arr, i, min);
    }
  }
};
// selectionSort(arr)
// console.log(arr)

const insertionSort = (arr) => {
  const n = arr.length;
  for (let i = 1; i < n; i++) {
    let p = arr[i];
    let j = i - 1;
    while (j >= 0 && arr[j] > p) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = p;
  }
};

// insertionSort(arr)
// console.log(arr)

const MergeSort = (arr, si = 0, ei = arr.length - 1) => {
  if (si >= ei) {
    return arr;
  } else {
    let mid = Math.floor(si + (ei - si) / 2);
    MergeSort(arr, si, mid);
    MergeSort(arr, mid + 1, ei);
    merge(arr, si, mid, ei);
  }
  return arr;
};

const merge = (arr, si, mid, ei) => {
  let sorted = [];
  let i = si;
  let j = mid + 1;
  let k = 0;
  let n = arr.length;
  while (i <= mid && j <= ei) {
    if (arr[i] < arr[j]) {
      sorted[k++] = arr[i++];
    } else {
      sorted[k++] = arr[j++];
    }
  }
  while (i <= mid) {
    sorted[k++] = arr[i++];
  }
  while (j <= ei) {
    sorted[k++] = arr[j++];
  }

  for (let a = 0, b = si; a < sorted.length; a++, b++) {
    arr[b] = sorted[a];
  }
};
// console.log(MergeSort(arr))
const MergeSort2 = (arr) => {
  if (arr.length < 2) {
    return arr;
  } else {
    const mid = Math.floor(arr.length / 2);
    let left = MergeSort2(arr.splice(0, mid));
    let right = MergeSort2(arr);
    return merge2(left, right);
  }
};
const merge2 = (left, right) => {
  let sorted = [];
  while (left.length && right.length) {
    if (left[0] < right[0]) {
      sorted.push(left.shift());
    } else {
      sorted.push(right.shift());
    }
  }
  return [...sorted, ...left, ...right];
};

// console.log(MergeSort2(arr))

function quickSort(arr, si = 0, ei = arr.length - 1) {
  if (si < ei) {
    let pi = divide(arr, si, ei);
    quickSort(arr, si, pi - 1);
    quickSort(arr, pi + 1, ei);
  }
  return arr;
}

function divide(arr, si, ei) {
  // console.log(si);
  let start = si;
  let end = ei;
  let pivot = arr[si];
  while (start < end) {
    while (arr[start] <= pivot) {
      start++;
    }
    while (arr[end] > pivot) {
      end--;
    }
    if (start < end) {
      swap(arr, start, end);
    }

    swap(arr, end, si);

    return end;
  }
}
console.log(arr);
console.log(quickSort(arr));

const partition = (arr,si, ei) => {
  let start = si
};

const quickSort1 = (arr, si = 0, ei = arr.length - 1) => {
  if (si < ei) {
    let pi = partition(arr, si, ei);

    // quickSort(arr, si, pi - 1);

    // quickSort(arr, pi + 1, ei);
  }
  return arr;
};


