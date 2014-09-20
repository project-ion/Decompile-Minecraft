/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bko
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1961 */     if ((paramblf.c[ej.c.a()] != 0) && (!paramblf.b[ej.c.a()].d)) {
/*    9:1962 */       return true;
/*   10:     */     }
/*   11:1964 */     return false;
/*   12:     */   }
/*   13:     */   
/*   14:     */   public blb a(ej paramej, blf paramblf, Random paramRandom)
/*   15:     */   {
/*   16:1969 */     blf localblf = paramblf;
/*   17:1970 */     if ((paramblf.c[ej.c.a()] == 0) || (paramblf.b[ej.c.a()].d)) {
/*   18:1971 */       localblf = paramblf.b[ej.d.a()];
/*   19:     */     }
/*   20:1973 */     localblf.d = true;
/*   21:1974 */     localblf.b[ej.c.a()].d = true;
/*   22:1975 */     return new bky(paramej, localblf, paramRandom);
/*   23:     */   }
/*   24:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bko
 * JD-Core Version:    0.7.0.1
 */