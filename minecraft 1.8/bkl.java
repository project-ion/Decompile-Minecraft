/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkl
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1982 */     if ((paramblf.c[ej.f.a()] != 0) && (!paramblf.b[ej.f.a()].d) && 
/*    9:1983 */       (paramblf.c[ej.b.a()] != 0) && (!paramblf.b[ej.b.a()].d))
/*   10:     */     {
/*   11:1984 */       blf localblf = paramblf.b[ej.f.a()];
/*   12:     */       
/*   13:1986 */       return (localblf.c[ej.b.a()] != 0) && (!localblf.b[ej.b.a()].d);
/*   14:     */     }
/*   15:1989 */     return false;
/*   16:     */   }
/*   17:     */   
/*   18:     */   public blb a(ej paramej, blf paramblf, Random paramRandom)
/*   19:     */   {
/*   20:1994 */     paramblf.d = true;
/*   21:1995 */     paramblf.b[ej.f.a()].d = true;
/*   22:1996 */     paramblf.b[ej.b.a()].d = true;
/*   23:1997 */     paramblf.b[ej.f.a()].b[ej.b.a()].d = true;
/*   24:1998 */     return new bkv(paramej, paramblf, paramRandom);
/*   25:     */   }
/*   26:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bkl
 * JD-Core Version:    0.7.0.1
 */