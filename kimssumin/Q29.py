def solution(str1, str2):
    answer = 0
    
    new_str1 = [str1[i:i+2].upper() for i in range(0, len(str1)-1) if str1[i:i+2].isalpha()]
    new_str2 = [str2[i:i+2].upper() for i in range(0, len(str2)-1) if str2[i:i+2].isalpha()]
    
    set1 = set(new_str1)
    set2 = set(new_str2)
    
    gyo = list(set1.intersection(set2))
    hap = list(set1.union(set2))
    
    if len(gyo)==0 and len(hap)== 0:
        return 65536
    
    gcnt = 0
    hcnt = 0
    for g in gyo:
        gcnt += (min(new_str1.count(g), new_str2.count(g)))
    for h in hap:
        hcnt += (max(new_str1.count(h), new_str2.count(h)))
        
    return int(gcnt/hcnt * 65536)
