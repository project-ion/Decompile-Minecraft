/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bna
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   public bna() {}
/*    8:     */   
/*    9:     */   public bna(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   10:     */   {
/*   11: 926 */     super(parambnk, paramInt);
/*   12:     */     
/*   13: 928 */     this.m = paramej;
/*   14: 929 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public static bna a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   18:     */   {
/*   19: 933 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 9, 6, paramej);
/*   20: 935 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   21: 936 */       return null;
/*   22:     */     }
/*   23: 939 */     return new bna(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   24:     */   }
/*   25:     */   
/*   26:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   27:     */   {
/*   28: 944 */     if (this.h < 0)
/*   29:     */     {
/*   30: 945 */       this.h = b(paramaqu, parambjb);
/*   31: 946 */       if (this.h < 0) {
/*   32: 947 */         return true;
/*   33:     */       }
/*   34: 949 */       this.l.a(0, this.h - this.l.e + 9 - 1, 0);
/*   35:     */     }
/*   36: 953 */     a(paramaqu, parambjb, 1, 1, 1, 7, 5, 4, aty.a.P(), aty.a.P(), false);
/*   37:     */     
/*   38:     */ 
/*   39: 956 */     a(paramaqu, parambjb, 0, 0, 0, 8, 0, 5, aty.e.P(), aty.e.P(), false);
/*   40:     */     
/*   41: 958 */     a(paramaqu, parambjb, 0, 5, 0, 8, 5, 5, aty.e.P(), aty.e.P(), false);
/*   42: 959 */     a(paramaqu, parambjb, 0, 6, 1, 8, 6, 4, aty.e.P(), aty.e.P(), false);
/*   43: 960 */     a(paramaqu, parambjb, 0, 7, 2, 8, 7, 3, aty.e.P(), aty.e.P(), false);
/*   44: 961 */     int i = a(aty.ad, 3);
/*   45: 962 */     int j = a(aty.ad, 2);
/*   46: 963 */     for (int k = -1; k <= 2; k++) {
/*   47: 964 */       for (m = 0; m <= 8; m++)
/*   48:     */       {
/*   49: 965 */         a(paramaqu, aty.ad.a(i), m, 6 + k, k, parambjb);
/*   50: 966 */         a(paramaqu, aty.ad.a(j), m, 6 + k, 5 - k, parambjb);
/*   51:     */       }
/*   52:     */     }
/*   53: 971 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 5, aty.e.P(), aty.e.P(), false);
/*   54: 972 */     a(paramaqu, parambjb, 1, 1, 5, 8, 1, 5, aty.e.P(), aty.e.P(), false);
/*   55: 973 */     a(paramaqu, parambjb, 8, 1, 0, 8, 1, 4, aty.e.P(), aty.e.P(), false);
/*   56: 974 */     a(paramaqu, parambjb, 2, 1, 0, 7, 1, 0, aty.e.P(), aty.e.P(), false);
/*   57: 975 */     a(paramaqu, parambjb, 0, 2, 0, 0, 4, 0, aty.e.P(), aty.e.P(), false);
/*   58: 976 */     a(paramaqu, parambjb, 0, 2, 5, 0, 4, 5, aty.e.P(), aty.e.P(), false);
/*   59: 977 */     a(paramaqu, parambjb, 8, 2, 5, 8, 4, 5, aty.e.P(), aty.e.P(), false);
/*   60: 978 */     a(paramaqu, parambjb, 8, 2, 0, 8, 4, 0, aty.e.P(), aty.e.P(), false);
/*   61:     */     
/*   62:     */ 
/*   63: 981 */     a(paramaqu, parambjb, 0, 2, 1, 0, 4, 4, aty.f.P(), aty.f.P(), false);
/*   64: 982 */     a(paramaqu, parambjb, 1, 2, 5, 7, 4, 5, aty.f.P(), aty.f.P(), false);
/*   65: 983 */     a(paramaqu, parambjb, 8, 2, 1, 8, 4, 4, aty.f.P(), aty.f.P(), false);
/*   66: 984 */     a(paramaqu, parambjb, 1, 2, 0, 7, 4, 0, aty.f.P(), aty.f.P(), false);
/*   67:     */     
/*   68:     */ 
/*   69: 987 */     a(paramaqu, aty.bj.P(), 4, 2, 0, parambjb);
/*   70: 988 */     a(paramaqu, aty.bj.P(), 5, 2, 0, parambjb);
/*   71: 989 */     a(paramaqu, aty.bj.P(), 6, 2, 0, parambjb);
/*   72: 990 */     a(paramaqu, aty.bj.P(), 4, 3, 0, parambjb);
/*   73: 991 */     a(paramaqu, aty.bj.P(), 5, 3, 0, parambjb);
/*   74: 992 */     a(paramaqu, aty.bj.P(), 6, 3, 0, parambjb);
/*   75: 993 */     a(paramaqu, aty.bj.P(), 0, 2, 2, parambjb);
/*   76: 994 */     a(paramaqu, aty.bj.P(), 0, 2, 3, parambjb);
/*   77: 995 */     a(paramaqu, aty.bj.P(), 0, 3, 2, parambjb);
/*   78: 996 */     a(paramaqu, aty.bj.P(), 0, 3, 3, parambjb);
/*   79: 997 */     a(paramaqu, aty.bj.P(), 8, 2, 2, parambjb);
/*   80: 998 */     a(paramaqu, aty.bj.P(), 8, 2, 3, parambjb);
/*   81: 999 */     a(paramaqu, aty.bj.P(), 8, 3, 2, parambjb);
/*   82:1000 */     a(paramaqu, aty.bj.P(), 8, 3, 3, parambjb);
/*   83:1001 */     a(paramaqu, aty.bj.P(), 2, 2, 5, parambjb);
/*   84:1002 */     a(paramaqu, aty.bj.P(), 3, 2, 5, parambjb);
/*   85:1003 */     a(paramaqu, aty.bj.P(), 5, 2, 5, parambjb);
/*   86:1004 */     a(paramaqu, aty.bj.P(), 6, 2, 5, parambjb);
/*   87:     */     
/*   88:     */ 
/*   89:1007 */     a(paramaqu, parambjb, 1, 4, 1, 7, 4, 1, aty.f.P(), aty.f.P(), false);
/*   90:1008 */     a(paramaqu, parambjb, 1, 4, 4, 7, 4, 4, aty.f.P(), aty.f.P(), false);
/*   91:1009 */     a(paramaqu, parambjb, 1, 3, 4, 7, 3, 4, aty.X.P(), aty.X.P(), false);
/*   92:     */     
/*   93:     */ 
/*   94:1012 */     a(paramaqu, aty.f.P(), 7, 1, 4, parambjb);
/*   95:1013 */     a(paramaqu, aty.ad.a(a(aty.ad, 0)), 7, 1, 3, parambjb);
/*   96:1014 */     k = a(aty.ad, 3);
/*   97:1015 */     a(paramaqu, aty.ad.a(k), 6, 1, 4, parambjb);
/*   98:1016 */     a(paramaqu, aty.ad.a(k), 5, 1, 4, parambjb);
/*   99:1017 */     a(paramaqu, aty.ad.a(k), 4, 1, 4, parambjb);
/*  100:1018 */     a(paramaqu, aty.ad.a(k), 3, 1, 4, parambjb);
/*  101:     */     
/*  102:     */ 
/*  103:1021 */     a(paramaqu, aty.aO.P(), 6, 1, 3, parambjb);
/*  104:1022 */     a(paramaqu, aty.aB.P(), 6, 2, 3, parambjb);
/*  105:1023 */     a(paramaqu, aty.aO.P(), 4, 1, 3, parambjb);
/*  106:1024 */     a(paramaqu, aty.aB.P(), 4, 2, 3, parambjb);
/*  107:1025 */     a(paramaqu, aty.ai.P(), 7, 1, 1, parambjb);
/*  108:     */     
/*  109:     */ 
/*  110:1028 */     a(paramaqu, aty.a.P(), 1, 1, 0, parambjb);
/*  111:1029 */     a(paramaqu, aty.a.P(), 1, 2, 0, parambjb);
/*  112:1030 */     a(paramaqu, parambjb, paramRandom, 1, 1, 0, ej.b(a(aty.ao, 1)));
/*  113:1031 */     if ((a(paramaqu, 1, 0, -1, parambjb).c().r() == bof.a) && (a(paramaqu, 1, -1, -1, parambjb).c().r() != bof.a)) {
/*  114:1032 */       a(paramaqu, aty.aw.a(a(aty.aw, 3)), 1, 0, -1, parambjb);
/*  115:     */     }
/*  116:1035 */     for (int m = 0; m < 6; m++) {
/*  117:1036 */       for (int n = 0; n < 9; n++)
/*  118:     */       {
/*  119:1037 */         b(paramaqu, n, 9, m, parambjb);
/*  120:1038 */         b(paramaqu, aty.e.P(), n, -1, m, parambjb);
/*  121:     */       }
/*  122:     */     }
/*  123:1042 */     a(paramaqu, parambjb, 2, 1, 2, 1);
/*  124:     */     
/*  125:1044 */     return true;
/*  126:     */   }
/*  127:     */   
/*  128:     */   protected int c(int paramInt1, int paramInt2)
/*  129:     */   {
/*  130:1049 */     return 1;
/*  131:     */   }
/*  132:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bna
 * JD-Core Version:    0.7.0.1
 */