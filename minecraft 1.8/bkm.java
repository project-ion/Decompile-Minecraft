/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkm
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1925 */     if ((paramblf.c[ej.b.a()] != 0) && (!paramblf.b[ej.b.a()].d)) {
/*    9:1926 */       return true;
/*   10:     */     }
/*   11:1928 */     return false;
/*   12:     */   }
/*   13:     */   
/*   14:     */   public blb a(ej paramej, blf paramblf, Random paramRandom)
/*   15:     */   {
/*   16:1933 */     blf localblf = paramblf;
/*   17:1934 */     localblf.d = true;
/*   18:1935 */     localblf.b[ej.b.a()].d = true;
/*   19:1936 */     return new bkw(paramej, localblf, paramRandom);
/*   20:     */   }
/*   21:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bkm
 * JD-Core Version:    0.7.0.1
 */