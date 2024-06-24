package leetcode;
//MCMXCIV
public class RomanToInteger {
        public int romanToInt(String s) {
                Integer count = 0;
                int curIndex = 0;
                for (char c : s.toCharArray()) {
                        char prevChar = c;

                        if (curIndex > 0) {
                                prevChar = s.toCharArray()[curIndex - 1];
                        }

                        switch (c) {
                                case 'I': {
                                    count += 1;
                                    break;
                                }
                                case 'V': {
                                     if (curIndex > 0 && prevChar == 'I') {
                                             count += 3;
                                     } else {
                                             count += 5;
                                     }
                                        break;
                                }
                                case 'X': {
                                    if (curIndex > 0 && prevChar == 'I') {
                                            count += 8;
                                    } else {
                                            count += 10;
                                    }
                                        break;
                                }
                                case 'L': {
                                     if (curIndex > 0 && prevChar == 'X') {
                                             count += 30;
                                     }   else {
                                             count += 50;
                                     }
                                        break;
                                }
                                case 'C': {
                                        if (curIndex > 0 && prevChar == 'X') {
                                                count += 80;
                                        }else {
                                                count += 100;
                                        }
                                        break;
                                }
                                case 'D': {
                                        if (curIndex > 0 && prevChar == 'C') {
                                                count += 300;
                                        } else {
                                                count += 500;
                                        }
                                        break;
                                }
                                case 'M': {
                                        if (curIndex > 0 && prevChar == 'C') {
                                                count += 800;
                                        } else {
                                                count += 1000;
                                        }
                                        break;
                                }
                        }
                        curIndex++;
                }
                return count;
        }
}
