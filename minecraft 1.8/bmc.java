/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bmc
/*    5:     */   extends bmk
/*    6:     */ {
/*    7:     */   public bmc() {}
/*    8:     */   
/*    9:     */   public bmc(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   10:     */   {
/*   11:1083 */     super(paramInt);
/*   12:     */     
/*   13:1085 */     this.m = paramej;
/*   14:1086 */     this.d = a(paramRandom);
/*   15:1087 */     this.l = parambjb;
/*   16:     */   }
/*   17:     */   
/*   18:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   19:     */   {
/*   20:1092 */     a((bmh)parambms, paramList, paramRandom, 1, 1);
/*   21:     */   }
/*   22:     */   
/*   23:     */   public static bmc a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   24:     */   {
/*   25:1096 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 9, 5, 11, paramej);
/*   26:1098 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   27:1099 */       return null;
/*   28:     */     }
/*   29:1102 */     return new bmc(paramInt4, paramRandom, localbjb, paramej);
/*   30:     */   }
/*   31:     */   
/*   32:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   33:     */   {
/*   34:1107 */     if (a(paramaqu, parambjb)) {
/*   35:1108 */       return false;
/*   36:     */     }
/*   37:1112 */     a(paramaqu, parambjb, 0, 0, 0, 8, 4, 10, true, paramRandom, blr.c());
/*   38:     */     
/*   39:1114 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 1, 0);
/*   40:     */     
/*   41:1116 */     a(paramaqu, parambjb, 1, 1, 10, 3, 3, 10, aty.a.P(), aty.a.P(), false);
/*   42:     */     
/*   43:     */ 
/*   44:1119 */     a(paramaqu, parambjb, 4, 1, 1, 4, 3, 1, false, paramRandom, blr.c());
/*   45:1120 */     a(paramaqu, parambjb, 4, 1, 3, 4, 3, 3, false, paramRandom, blr.c());
/*   46:1121 */     a(paramaqu, parambjb, 4, 1, 7, 4, 3, 7, false, paramRandom, blr.c());
/*   47:1122 */     a(paramaqu, parambjb, 4, 1, 9, 4, 3, 9, false, paramRandom, blr.c());
/*   48:     */     
/*   49:     */ 
/*   50:1125 */     a(paramaqu, parambjb, 4, 1, 4, 4, 3, 6, aty.bi.P(), aty.bi.P(), false);
/*   51:1126 */     a(paramaqu, parambjb, 5, 1, 5, 7, 3, 5, aty.bi.P(), aty.bi.P(), false);
/*   52:     */     
/*   53:     */ 
/*   54:1129 */     a(paramaqu, aty.bi.P(), 4, 3, 2, parambjb);
/*   55:1130 */     a(paramaqu, aty.bi.P(), 4, 3, 8, parambjb);
/*   56:1131 */     a(paramaqu, aty.aA.a(a(aty.aA, 3)), 4, 1, 2, parambjb);
/*   57:1132 */     a(paramaqu, aty.aA.a(a(aty.aA, 3) + 8), 4, 2, 2, parambjb);
/*   58:1133 */     a(paramaqu, aty.aA.a(a(aty.aA, 3)), 4, 1, 8, parambjb);
/*   59:1134 */     a(paramaqu, aty.aA.a(a(aty.aA, 3) + 8), 4, 2, 8, parambjb);
/*   60:     */     
/*   61:1136 */     return true;
/*   62:     */   }
/*   63:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bmc
 * JD-Core Version:    0.7.0.1
 */