/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjx
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   public bjx() {}
/*    8:     */   
/*    9:     */   public bjx(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   10:     */   {
/*   11:1107 */     super(paramInt);
/*   12:     */     
/*   13:1109 */     this.m = paramej;
/*   14:1110 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   18:     */   {
/*   19:1115 */     a((bkf)parambms, paramList, paramRandom, 1, 0, true);
/*   20:     */   }
/*   21:     */   
/*   22:     */   public static bjx a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   23:     */   {
/*   24:1119 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, 0, 0, 5, 7, 5, paramej);
/*   25:1121 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   26:1122 */       return null;
/*   27:     */     }
/*   28:1125 */     return new bjx(paramInt4, paramRandom, localbjb, paramej);
/*   29:     */   }
/*   30:     */   
/*   31:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   32:     */   {
/*   33:1131 */     a(paramaqu, parambjb, 0, 0, 0, 4, 1, 4, aty.by.P(), aty.by.P(), false);
/*   34:     */     
/*   35:1133 */     a(paramaqu, parambjb, 0, 2, 0, 4, 5, 4, aty.a.P(), aty.a.P(), false);
/*   36:     */     
/*   37:     */ 
/*   38:1136 */     a(paramaqu, parambjb, 0, 2, 0, 0, 5, 4, aty.by.P(), aty.by.P(), false);
/*   39:1137 */     a(paramaqu, parambjb, 4, 2, 0, 4, 5, 4, aty.by.P(), aty.by.P(), false);
/*   40:1138 */     a(paramaqu, parambjb, 0, 3, 1, 0, 4, 1, aty.bz.P(), aty.bz.P(), false);
/*   41:1139 */     a(paramaqu, parambjb, 0, 3, 3, 0, 4, 3, aty.bz.P(), aty.bz.P(), false);
/*   42:1140 */     a(paramaqu, parambjb, 4, 3, 1, 4, 4, 1, aty.bz.P(), aty.bz.P(), false);
/*   43:1141 */     a(paramaqu, parambjb, 4, 3, 3, 4, 4, 3, aty.bz.P(), aty.bz.P(), false);
/*   44:     */     
/*   45:     */ 
/*   46:1144 */     a(paramaqu, parambjb, 0, 6, 0, 4, 6, 4, aty.by.P(), aty.by.P(), false);
/*   47:1147 */     for (int i = 0; i <= 4; i++) {
/*   48:1148 */       for (int j = 0; j <= 4; j++) {
/*   49:1149 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*   50:     */       }
/*   51:     */     }
/*   52:1153 */     return true;
/*   53:     */   }
/*   54:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bjx
 * JD-Core Version:    0.7.0.1
 */